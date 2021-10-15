import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(input: LocalDateTime) {
    constructor(input: LocalDate) : this(input.atStartOfDay())

    val date: LocalDateTime = input.plusSeconds(1_000_000_000)
}
