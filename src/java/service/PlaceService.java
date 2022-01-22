/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Place;
import connexion.Connexion;
import dao.IDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OTTO
 */
public class PlaceService implements IDao<Place>{

    @Override
    public boolean create(Place o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean gene(int idsec) {
         
        try {
            for (int i = 1; i < 7; i++) {
                String sql = "insert into place values (null, ?, false,?)";
                PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
                ps.setInt(1, i);
                ps.setInt(2, idsec);
                ps.executeUpdate();
            }
        } catch (SQLException e) {
           System.out.println(e.toString());
        }
        return false;
    }

    @Override
    public boolean delete(Place o) {
        String sql = "delete from place where idPlace  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, o.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("delete : erreur sql : " + e.getMessage());

        }
        return false;}

    @Override
    public boolean update(Place o) {
        String sql = "update place set numero = ? , etat = ?, idSection = ? where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, o.getNumero());
            ps.setBoolean(2, o.getEtat());
            ps.setInt(3, o.getIdSection());
            ps.setInt(4, o.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("update : erreur sql : " + e.getMessage());

        }
        return false;}

    @Override
    public Place findById(int id) {
        String sql = "select * from place where idPlace  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Place(rs.getInt("idPlace"), rs.getInt("numero"), rs.getBoolean("etat"), rs.getInt("idSection"));

            }

        } catch (SQLException e) {
            System.out.println("findById " + e.getMessage());
        }
        return null;}

    @Override
    public List<Place> findAll() {
        List<Place> places = new ArrayList<Place>();
        String sql = "select * from place";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                places.add(new Place(rs.getInt("idPlace"), rs.getInt("numero"), rs.getBoolean("etat"),  rs.getInt("idSection")));
                
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return places;
    }
    public boolean updateEtat(Place o , String etat) {
        String sql ="";
        if (etat.equals("false") )
        {
            sql = "update place set etat = true where idPlace  = ?";
        }
        else if(etat.equals("true"))
        {
            sql = "update place set etat = false where idPlace  = ?";
        }
        
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, o.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("update etat : erreur sql : " + e.getMessage());

        }
        return false;
    }
    public List<Place> findAllbySection(int id) {
        List<Place> places = new ArrayList<Place>();
        String sql = "select * from place where idSection =?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                places.add(new Place(rs.getInt("idPlace"), rs.getInt("numero"), rs.getBoolean("etat"),  rs.getInt("idSection")));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return places;
    }
    
}
