package com.wizlit.path.model.request;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewMemoRequest {
    private String memoTitle;
    private String memoContent;
}
