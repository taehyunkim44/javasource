/**
 *  qna_board_write.jsp 폼 유효성 검증
 */
$(function(){
	$("#writeForm").validate({
		rules:{
				name:{
						required:true
				},
				title:{
						required:true
				},
				content:{
						required:true
				},
				password:{
						required:true
				},
				attach:{
						extension:"png|jpg|gif",
						maxsizetotal:2048000
				},
				
		},
		messages:{
			name:{
						required:"(이름 입력)"
				},
				title:{
						required: "(제목 입력)"
				},
				content:{
						required:"(내용 입력)"
				},
				password:{
						required:"(비밀번호 입력)"
				},
				attach:{
						extension:"(이미지 파일만 가능)",
						maxsizetotal:"(파일 사이즈 초과)"
				},
			
		},
		errorElement : "span",
		errorPlacement : function(error,element){
				if(element.prop("type") == "file"){
						$(element).closest("form")
											  .find("small[id='"+element.attr('id')+"']")
											  .append(error);
				}else{
					$(element).closest("form")
										  .find("label[for='"+ element.attr('id')+"']")
										  .append("<br>").append(error);
				}
		}
	})
})