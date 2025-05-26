package com.wizlit.path.model.response;

import com.wizlit.path.entity.Edge;
import com.wizlit.path.entity.Point;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PathResponse {
    private Map<String, PointResponse> nodes;
    private List<EdgeResponse> edges;

    // function: convert from Edge and Point using OutputPointDto>fromPoint, OutputEdgeDto>fromPoint
    public static PathResponse fromEdgesAndPoints(List<Point> points, List<Edge> edges) {
        Map<String, PointResponse> nodes = points.stream()
                .map(PointResponse::fromPoint)
                .collect(Collectors.toMap(PointResponse::getId, pointDto -> pointDto));

        List<EdgeResponse> edgeDtos = edges.stream()
                .map(EdgeResponse::fromEdge)
                .toList();

        return PathResponse.builder()
                .nodes(nodes)
                .edges(edgeDtos)
                .build();
    }
}
