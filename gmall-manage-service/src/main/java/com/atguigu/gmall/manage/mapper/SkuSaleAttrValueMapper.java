package com.atguigu.gmall.manage.mapper;

import com.atguigu.gmall.bean.SkuInfo;
import com.atguigu.gmall.bean.SkuSaleAttrValue;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SkuSaleAttrValueMapper  extends Mapper<SkuSaleAttrValue> {
    List<SkuInfo> selectSkuSaleAttrValueListBySpu(String spuId);
}
