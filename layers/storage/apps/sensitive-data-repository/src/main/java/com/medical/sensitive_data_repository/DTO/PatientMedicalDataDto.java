package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record PatientMedicalDataDto(FamilyHistoryDto familyHistory, LifeHistoryDto lifeHistory, List<AdverseDrugReactionDto> allergicHistoryAndDrugIntolerance, List<ImmunobiologicalReactionDto> immunobiologicalReactions, TransfusionHistoryDto transfusionHistory, ObstetricGynecologicalHistoryDto obstetricGynecologicalHistory, List<VitalSignsDto> measurements) {
    public PatientMedicalDataDto {
        allergicHistoryAndDrugIntolerance = DtoLists.immutable(allergicHistoryAndDrugIntolerance);
        immunobiologicalReactions = DtoLists.immutable(immunobiologicalReactions);
        measurements = DtoLists.immutable(measurements);
    }
}

