package com.productservice.Controller;

import com.example.commonservice.Entity.APIResponse;
import com.example.commonservice.Util.CustomMapper;
import com.example.productservice.Entity.Dto.*;
import com.example.productservice.Entity.Enum.Category;
import com.example.productservice.Entity.Product;
import com.example.productservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/product")
public class ProductController {


}
