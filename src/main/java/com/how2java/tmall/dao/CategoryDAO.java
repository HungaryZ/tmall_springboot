package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: CategoryDAO
 * @Description:
 * @Author: zzb
 * @Date: 2021/10/15 14:22
 */
public interface CategoryDAO extends JpaRepository<Category,Integer> {
}
