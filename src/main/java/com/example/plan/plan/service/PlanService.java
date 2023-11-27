package com.example.plan.plan.service;

import com.example.plan.utils.ResponseMessage;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface PlanService {
    List<Map<String, Object>> findAll();

    List<Map<String, Object>> findPlanMealFood();

    List<Map<String, Object>> getPlanDetailsByCustomerFullName(String firstName, String lastName);

    ResponseEntity<ResponseMessage> generateReport(Map<String, Object> requestMap, String firstName, String lastName, LocalDate startDate, LocalDate endDate);

    @Transactional
    ResponseEntity<ResponseMessage> addPlan(Map<String, Object> requestMap);

    @Transactional
    ResponseEntity<ResponseMessage> addToPlan(Map<String, List<Object>> requestMap, int id);

    @Transactional
    ResponseEntity<ResponseMessage> addMealToPlan(Map<String, List<Object>> mealData, String name);

    @Transactional
    ResponseEntity<ResponseMessage> addCustomerToPlan(Map<String, List<Object>> requestMap, int id);

    @Transactional
    ResponseEntity<ResponseMessage> updatePlan(Map<String, String> requestMap, int id);

    @Transactional
    ResponseEntity<ResponseMessage> deletePlan(int id);

    @Transactional
    ResponseEntity<ResponseMessage> removeCustomerFromPlan(int customerId, int PlanId);

}
