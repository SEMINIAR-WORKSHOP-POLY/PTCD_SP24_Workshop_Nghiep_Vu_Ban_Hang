/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author hangnt
 */
public class HoaDon {

    private String id;
    private Date ngayTao;
    private String tenNguoiNhan;
    private String diaChi;
    private String soDienThoai;
    private int tongTien;
    private int trangThai;

    public HoaDon() {
    }

    public HoaDon(String tenNguoiNhan, String diaChi, String soDienThoai, int tongTien) {
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.tongTien = tongTien;
    }

    public HoaDon(String id, Date ngayTao, String tenNguoiNhan, String diaChi, String soDienThoai, int tongTien, int trangThai) {
        this.id = id;
        this.ngayTao = ngayTao;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    
}
