package com.zac.spring.boot.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.zac.spring.boot.web.entity.Image;

/**
 * Created by Zac
 */
public interface ImageRepository extends JpaRepository<Image, Integer>, JpaSpecificationExecutor<Image>  {
	List<Image> findByImageType(int imageType);
}
