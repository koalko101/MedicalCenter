package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record DisabilityAssessmentDto(UUID id, LocalDate assessedAt, String commissionName, String assessmentResult, String disabilityGroup, LocalDate validUntil, String recommendations, MedicalDocumentReferenceDto sourceDocument) {}

