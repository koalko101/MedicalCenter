package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record TransfusionHistoryDto(String bloodGroup, String rhFactor, List<TransfusionDto> transfusions) {
    public TransfusionHistoryDto {
        transfusions = DtoLists.immutable(transfusions);
    }
}

