package com.example.marketkurly.dto.request;

import com.example.marketkurly.model.Product;
import com.example.marketkurly.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestCartDto {
    private Long id;
    private Long sum;
    private String address;

    private User user;
    private List<Product> productIds;
}