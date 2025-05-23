package com.ecommerce.ecommerce.service.product;

import java.util.List;

import com.ecommerce.ecommerce.dto.product.ProductCreateMultipartDto;
import com.ecommerce.ecommerce.dto.product.ProductDto;
import com.ecommerce.ecommerce.dto.product.ProductSpecialCategoriesPatchDto;

public interface ProductService {
    ProductDto createProduct(ProductCreateMultipartDto productCreateDto);
    List<ProductDto> getAllProducts();
    ProductDto getProductById(Long id);
    ProductDto updateProduct(Long id, ProductCreateMultipartDto productUpdateDto);
    void deleteProduct(Long id);
    ProductDto patchSpecialCategories(Long id, ProductSpecialCategoriesPatchDto specialCategoriesDto);
}