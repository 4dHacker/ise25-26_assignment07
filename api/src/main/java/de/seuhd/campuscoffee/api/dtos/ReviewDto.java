package de.seuhd.campuscoffee.api.dtos;

import java.time.LocalDateTime;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

/**
 * DTO record for POS metadata.
 */
@Builder(toBuilder = true)
public record ReviewDto (
    @Nullable Long id,
    @Nullable LocalDateTime createdAt,
    @Nullable LocalDateTime updatedAt,

    @NonNull Long posId,

    @NonNull Long authorId,

    @NotBlank(message = "Review description cannot be empty.")
    @NonNull String review,

    @NonNull Boolean approved
) implements Dto<Long> {
    @Override
    public @Nullable Long getId() {
        return id;
    }
}
