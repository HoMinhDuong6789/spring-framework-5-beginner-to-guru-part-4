package com.udemy.springmvcrestdemo.bootstrap;

import com.udemy.springmvcrestdemo.domain.Category;
import com.udemy.springmvcrestdemo.domain.Customer;
import com.udemy.springmvcrestdemo.repositories.CategoryRepository;
import com.udemy.springmvcrestdemo.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private CategoryRepository categoryRepository;
    private final CustomerRepository customerRepository;

    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadCategories();
        loadCustomers();
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
}
