package com.udemy.springmvcrestdemo.bootstrap;

import com.udemy.springmvcrestdemo.domain.Category;
import com.udemy.springmvcrestdemo.domain.Customer;
import com.udemy.springmvcrestdemo.domain.Vendor;
import com.udemy.springmvcrestdemo.repositories.CategoryRepository;
import com.udemy.springmvcrestdemo.repositories.CustomerRepository;
import com.udemy.springmvcrestdemo.repositories.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private CategoryRepository categoryRepository;
    private final CustomerRepository customerRepository;
    private final VendorRepository vendorRepository;

    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadCategories();
        loadCustomers();
        loadVendors();
    }

    private void loadCategories() {
        Category fruits = new Category();
        fruits.setName("Fruits");
        Category dried = new Category();
        dried.setName("Dried");
        Category fresh = new Category();
        fresh.setName("Fresh");
        Category exotic = new Category();
        exotic.setName("Exotic");
        Category nuts = new Category();
        nuts.setName("Nuts");
        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);
        System.out.println("Loaded " + categoryRepository.count() + " categories");
    }

    private void loadCustomers() {
        Customer customer1 = new Customer();
        customer1.setId(1l);
        customer1.setFirstname("Darth");
        customer1.setLastname("Vader");
        customerRepository.save(customer1);
        Customer customer2 = new Customer();
        customer2.setId(2l);
        customer2.setFirstname("Hans");
        customer2.setLastname("Landa");
        customerRepository.save(customer2);
        System.out.println("Loaded: " + customerRepository.count() + " customers");
    }

    private void loadVendors() {
        Vendor vendor1 = new Vendor();
        vendor1.setName("Raistlin");
        vendorRepository.save(vendor1);
        Vendor vendor2 = new Vendor();
        vendor2.setName("Caramon");
        vendorRepository.save(vendor2);
    }
}
