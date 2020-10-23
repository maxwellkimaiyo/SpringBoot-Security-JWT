package com.web.backend.payload.response;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class JwtResponse {

	@NonNull
	private String token;

	private String type = "Bearer";

	@NonNull
	private Long id;

	@NonNull
	private String name;

	@NonNull
	private String username;

	@NonNull
	private String email;

	@NonNull
	private List<String> roles;

	public JwtResponse( String token, String type,
						Long id,  String name,
						String username,  String email,
						List<String> roles) {
		this.token = token;
		this.type = type;
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}


}