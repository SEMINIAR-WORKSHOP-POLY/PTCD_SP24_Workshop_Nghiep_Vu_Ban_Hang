/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import repository.HoaDonChiTietResponsitory;
import response.HoaDonChiTietResponse;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class HoaDonChiTietService {

    private final HoaDonChiTietResponsitory hoaDonChiTietResponsitory
            = new HoaDonChiTietResponsitory();

    public List<HoaDonChiTietResponse> getAllByHoaDonID(String id) {
        return hoaDonChiTietResponsitory.getAllByHoaDonID(id);
    }

    public String addListOrder(String hoaDonID, List<HoaDonChiTietResponse> lists) {
        boolean add = hoaDonChiTietResponsitory.addListOrder(hoaDonID, lists);
        if (add) {
            return "Add thanh cong";
        }
        return "Add that bai";
    }

}
