package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record EncounterSummaryDto(UUID encounterId, LocalDateTime startedAt, LocalDateTime completedAt, String organizationName, String reason, String outcome) {}

