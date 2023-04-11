package com.spring_boot.projectEx.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_boot.projectEx.model.CartVO;
import com.spring_boot.projectEx.model.MemberVO;
import com.spring_boot.projectEx.model.OrderInfoVO;

public interface ICartDAO {
	public void insertCart(CartVO vo); // 장바구니에 추가
	public int checkPrdInCart(HashMap<String, Object> map); // 동일 상품 존재 여부 확인 (반환값: 동일 상품 개수)
	public void updateQtyInCart(CartVO vo); //동일 상품이  존재하면 수량 변경
	public ArrayList<CartVO> cartList(String memId); // 현재 회원의 장바구니 목록 반환
	public void deleteCart(String cartNo); // 장바구니 삭제

	public MemberVO getMemberInfo(String memid);
	public void updateCart(CartVO vo);

	// 주문 완료 처리 : 주문 내역 저장
	public void insertOrderInfo(OrderInfoVO ordInfoVo); // 주문 정보 저장
	public void insertOrderProduct(HashMap<String, Object> map); // 주문 상품 내용 저장
	public void deleteCartAfterOrder(String memId);// 주문 후 장바구니 내용 비우기(삭제)
}
