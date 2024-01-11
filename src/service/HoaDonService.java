/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.HoaDon;
import repository.HoaDonResponsitory;
import response.HoaDonResponse;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class HoaDonService {

    private final HoaDonResponsitory hoaDonResponsitory
            = new HoaDonResponsitory();

    public List<HoaDonResponse> getAll() {
        return hoaDonResponsitory.getAll();
    }

    public HoaDon getOne(String id) {
        return hoaDonResponsitory.getOne(id);
    }

    public String addHoaDon(HoaDon hoaDon) {
        boolean add = hoaDonResponsitory.addHoaDon(hoaDon);
        if (add) {
            return "Add thanh cong";
        }
        return "Add that bai";
    }

    public String updateHoaDon(String id, HoaDon hoaDon) {
        boolean update = hoaDonResponsitory.updateHoaDon(id, hoaDon);
        if (update) {
            return "Update thanh cong";
        }
        return "Update that bai";
    }

}
