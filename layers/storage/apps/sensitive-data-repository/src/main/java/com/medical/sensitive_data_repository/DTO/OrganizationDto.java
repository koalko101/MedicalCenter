package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record OrganizationDto(String name, String registrationNumber, AddressDto address, String phone, String headName, String headPosition) {}

