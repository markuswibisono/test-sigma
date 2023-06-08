package com.project.models.entites;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@SuppressWarnings("serial")

public class ResponseDelete {
    

    private Long id;


    public ResponseDelete(Long id) {
		this.id = id;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
