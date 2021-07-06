package com.codegym;

import java.util.Comparator;

public class SortSP implements Comparator<SanPham> {

    @Override
    public int compare(SanPham o1, SanPham o2) {
        return o1.getTenSP().compareTo(o2.getTenSP());
    }
}
