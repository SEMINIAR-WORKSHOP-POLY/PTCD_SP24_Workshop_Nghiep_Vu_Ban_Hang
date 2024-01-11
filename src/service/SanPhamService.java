/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.SanPham;
import repository.SanPhamRespository;
import response.SanPhamResponse;
import java.util.List;
import java.util.Map;

/**
 *
 * @author hangnt
 */
public class SanPhamService {

    private final SanPhamRespository sanPhamRespository
            = new SanPhamRespository();

    public List<SanPhamResponse> getAll() {
        return sanPhamRespository.getAll();
    }

    public SanPham getOne(String id) {
        return sanPhamRespository.getOne(id);
    }

    public void update(Map<SanPhamResponse, Integer> sanPhamResponse) {
        sanPhamResponse.forEach(
                (k, v) -> {
                    sanPhamRespository.update(k.getId(), v);
                }
        );

    }

}
