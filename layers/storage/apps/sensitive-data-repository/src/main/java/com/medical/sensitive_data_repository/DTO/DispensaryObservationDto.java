package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record DispensaryObservationDto(UUID id, LocalDate takenUnderObservationAt, String diagnosisCode, String diagnosisName, LocalDate diagnosisFirstEstablishedAt, String healthGroup, List<HealthGroupChangeDto> healthGroupHistory, LocalDate lastExaminationAt, LocalDate nextExaminationAt, LocalDate removedAt, String removalReason, List<DispensaryPlanItemDto> individualPlan, String effectivenessNotes, MedicalDocumentReferenceDto sourceDocument) {
    public DispensaryObservationDto {
        healthGroupHistory = DtoLists.immutable(healthGroupHistory);
        individualPlan = DtoLists.immutable(individualPlan);
    }
}

