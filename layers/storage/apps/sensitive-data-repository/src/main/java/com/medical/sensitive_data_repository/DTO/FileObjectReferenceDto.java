package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record FileObjectReferenceDto(String objectId, String storageKey, String fileName, String mediaType, Long sizeBytes, String checksumSha256) {}

