package com.udemy.springmvcrestdemo.api.v1.mapper;

import com.udemy.springmvcrestdemo.api.v1.model.VendorDTO;
import com.udemy.springmvcrestdemo.domain.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VendorMapper {

    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    VendorDTO vendorToVendorDTO(Vendor vendor);

    Vendor vendorDTOtoVendor(VendorDTO vendorDTO);
}