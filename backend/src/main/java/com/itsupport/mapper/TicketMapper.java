package com.itsupport.mapper;

import com.itsupport.dto.TicketDto;
import com.itsupport.model.Ticket;
import org.mapstruct.Mapper;

/**
 * Mapper interface for converting between Ticket entities and TicketDto.
 *
 * This interface uses MapStruct to automate the mapping between the Ticket entity
 * and the TicketDto. It provides a method for converting a TicketDto to a Ticket entity.
 *
 * Mapping methods:
 *
 * - {@link #toEntity(TicketDto)}: Converts a TicketDto object to a Ticket entity.
 *
 * Example usage:
 *
 * {@code
 * Ticket ticket = ticketMapper.toEntity(ticketDto);
 * }
 *
 * Created by Yolanda Yang
 *
 * Contact:
 * Email: yolanda9264d@hotmail.com
 
 *
 * @see com.itsupport.model.Ticket
 * @see com.itsupport.dto.TicketDto
 */
@Mapper(componentModel = "spring")
public interface TicketMapper {

    /**
     * Converts a TicketDto object to a Ticket entity.
     *
     * @param ticketDto the TicketDto object to convert
     * @return the corresponding Ticket entity
     */
    Ticket toEntity(TicketDto ticketDto);
}
