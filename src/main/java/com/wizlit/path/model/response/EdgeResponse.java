package com.wizlit.path.model.response;

import com.wizlit.path.entity.Edge;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EdgeResponse {
    private String origin;
    private String destination;
    private Boolean trimmed;

    // function: convert from Edge
    public static EdgeResponse fromEdge(Edge edge) {
        return EdgeResponse.builder()
                .origin(edge.getOriginPoint().toString())
                .destination(edge.getDestinationPoint().toString())
                .trimmed(Boolean.FALSE) // Default value or modify as required
                .build();
    }
}
