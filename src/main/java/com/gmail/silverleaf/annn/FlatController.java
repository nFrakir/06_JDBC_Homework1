package com.gmail.silverleaf.annn;

import java.sql.*;

public class FlatController {
    private final String QUERY = "SELECT * FROM flat WHERE address = ? AND rooms = ? AND price <= ?";

    public FlatController() {
        super();
    }

    public FlatCollection requestFlatCollection(String address, int rooms, Double price) throws SQLException{
        DbProperties properties = new DbProperties();
        FlatCollection flatCollection = new FlatCollection();

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(properties.getUrl(), properties.getUser(), properties.getPassword())) {
            PreparedStatement ps = connection.prepareStatement(QUERY);
            ps.setString(1, address);
            ps.setInt(2, rooms);
            ps.setDouble(3, price);

            ResultSet rs = ps.executeQuery();
            for (; rs.next();) {
                flatCollection.addFlat(rs.getString("district"),
                        rs.getString("address"),
                        rs.getDouble("square"),
                        rs.getInt("rooms"),
                        rs.getDouble("price"));
            }
        }
        return flatCollection;
    }
}
