package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record AddressDto(String country, String region, String district, String locality, String street, String house, String building, String apartment, AddressType type) {}

