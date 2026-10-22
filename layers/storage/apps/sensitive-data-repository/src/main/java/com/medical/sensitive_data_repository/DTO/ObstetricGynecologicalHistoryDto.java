package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record ObstetricGynecologicalHistoryDto(MenstrualHistoryDto menstrualHistory, List<PregnancyDto> pregnancies, LocalDate menopauseStartedAt, String menopauseCourse, String otherInformation) {
    public ObstetricGynecologicalHistoryDto {
        pregnancies = DtoLists.immutable(pregnancies);
    }
}

