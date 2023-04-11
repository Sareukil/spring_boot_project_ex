package com.spring_boot.projectEx.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_boot.projectEx.model.CartVO;
import com.spring_boot.projectEx.model.MemberVO;
import com.spring_boot.projectEx.model.OrderInfoVO;

	public interface ICartService {
	public void insertCart(CartVO vo); // 장바구니에 추가
	public int checkPrdInCart(String prdNo, String memId); // 동일 상품 존재 여부 확인 (반환값: 동일 상품 개수)
	public void updateQtyInCart(CartVO vo); //동일 상품이  존재하면 수량 변경
	public ArrayList<CartVO> cartList(String memId); // 현재 회원의 장바구니 목록 반환
	public void deleteCart(String cartNo); // 장바구니 삭제

	public MemberVO getMemberInfo(String memid);
	public void updateCart(CartVO vo);

	// 주문 완료 처리 : 주문 내역 저장
	public void insertOrder(OrderInfoVO ordInfoVo);
}
