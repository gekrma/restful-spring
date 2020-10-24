1. 주제
	- 재고관리 프로그램

2. 구성
	- 1) Spring Web RestController
	- 2) Oracle SQL
	- 3) Entity
		-  @Id @GeneratedValue( generator = "product_id_seq" )<br />
		   private Long id;<br />
	                 private String name;<br />
		   private Long price;<br />
		   private int quantity;<br />
	- 4) html/css/js

3. 기능
	- 1) Spring RestController를 이용하여 Restful API 구축 및 CRUD
	- 2) axios를 이용하여 Restful API로부터 데이터를 받아와 html/css/js로 표현