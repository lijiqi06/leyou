package com.leyou.item.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    public List<Category> queryCategoryListByPid(Long pid){
        Category category = new Category();
        category.setParentId(pid);
        //查询条件 mapper会把Category中非空属性作为查询条件
        List<Category> categories = categoryMapper.select(category);
        //判断结果
        if(CollectionUtils.isEmpty(categories)){
            throw new LyException(ExceptionEnum.CATEGORY_NOT_FONE);
        }
        return categories;
    }
}
