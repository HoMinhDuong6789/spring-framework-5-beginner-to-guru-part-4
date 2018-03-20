package com.udemy.springmvcrestdemo.api.mapper;

import com.udemy.springmvcrestdemo.api.model.CategoryDTO;
import com.udemy.springmvcrestdemo.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
