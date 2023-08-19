package test;


public class ThoiKhoaBieu {
    private day ngay;

    private String cacMonHoc;

    public ThoiKhoaBieu(day ngay, String cacMonHoc) {
        this.ngay = ngay;
        this.cacMonHoc = cacMonHoc;
    }

    public day getNgay() {
        return ngay;
    }

    public void setNgay(day ngay) {
        this.ngay = ngay;
    }

    public String getCacMonHoc() {
        return cacMonHoc;
    }

    public void setCacMonHoc(String cacMonHoc) {
        this.cacMonHoc = cacMonHoc;
    }

    @Override
    public String toString() {
        return "ThoiKhoaBieu{" +
                "ngay=" + ngay +
                ", cacMonHoc='" + cacMonHoc + '\'' +
                '}';
    }
}
