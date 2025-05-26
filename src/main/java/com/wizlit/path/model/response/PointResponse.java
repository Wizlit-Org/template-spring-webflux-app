package com.wizlit.path.model.response;

import com.wizlit.path.entity.Point;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PointResponse {
    private String id;
    private String title;
    private String objective;
    private String document;
    private Timestamp created_on;

    // function: convert Point to OutputPointDto
    public static PointResponse fromPoint(Point point) {
        return PointResponse.builder()
                .id(point.getId().toString())
                .title(point.getTitle())
                .objective(point.getObjective())
                .document(point.getDocument())
                .created_on(point.getCreatedOn())
                .build();
    }
}
