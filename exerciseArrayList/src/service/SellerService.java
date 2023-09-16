package service;

import entity.Seller;

import java.util.List;

public class SellerService {
    private List<Seller> sellerList;

    public SellerService(List<Seller> sellerList) {
        this.sellerList = sellerList;
    }

    public void addSeller(Seller seller) {
        sellerList.add(seller);
    }

    public void removeSeller(long id) {
        sellerList.removeIf(seller -> seller.getId() == id);
    }

    public Seller findSellerById(long id) {
        for (Seller seller : sellerList) {
            if (seller.getId() == id) {
                return seller;
            }
        }
        return null;
    }

    public List<Seller> getAllSellers() {
        return sellerList;
    }

    public void updateSeller(Seller updateSeller) {
        Seller existingSeller = findSellerById(updateSeller.getId());
        if (existingSeller != null) {
            existingSeller.setWallet(updateSeller.getWallet());
        }
    }
}