package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record MenstrualHistoryDto(LocalDate firstMenstruationAt, String establishmentAndCycle, Integer durationDays, String intensity, String painfulness, LocalDate lastMenstruationAt) {}

