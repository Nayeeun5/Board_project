package com.pusan.board_back.service;

import org.springframework.http.ResponseEntity;

import com.pusan.board_back.dto.request.user.PatchNicknameRequestDto;
import com.pusan.board_back.dto.request.user.PatchProfileImageRequestDto;
import com.pusan.board_back.dto.response.user.GetSignInUserResponseDto;
import com.pusan.board_back.dto.response.user.GetUserResponseDto;
import com.pusan.board_back.dto.response.user.PatchNicknameResponseDto;
import com.pusan.board_back.dto.response.user.PatchProfileImageResponseDto;

public interface UserService {

    ResponseEntity<? super GetUserResponseDto> getUser(String email);
    ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(String email);
    ResponseEntity<? super PatchNicknameResponseDto> patchNickname(PatchNicknameRequestDto dto, String email);
    ResponseEntity<? super PatchProfileImageResponseDto> patchProfileImage(PatchProfileImageRequestDto dto, String email);

}
