/**
 * 
 */

$(document).ready(function() {
	$('.delete-product').on('click', function (){
		/*<![CDATA[*/
	    var path = /*[[@{/}]]*/'remove';
	    /*]]>*/
		
		var id=$(this).attr('id');
		
		bootbox.confirm({
			message: "Bạn có chắc chắn muốn xóa sản phẩm ? Hành động này không thể hoàn tác.",
			buttons: {
				cancel: {
					label:'<i class="fa fa-times"></i> Hủy'
				},
				confirm: {
					label:'<i class="fa fa-check"></i> Xác nhận'
				}
			},
			callback: function(confirmed) {
				if(confirmed) {
					$.post(path, {'id':id}, function(res) {
						location.reload();
					});
				}
			}
		});
	});
	
	
	
//	$('.checkboxProduct').click(function () {
//        var id = $(this).attr('id');
//        if(this.checked){
//            productIdList.push(id);
//        }
//        else {
//            productIdList.splice(productIdList.indexOf(id), 1);
//        }
//    })
	
	$('#deleteSelected').click(function() {
		var idList= $('.checkboxProduct');
		var productIdList=[];
		for (var i = 0; i < idList.length; i++) {
			if(idList[i].checked==true) {
				productIdList.push(idList[i]['id'])
			}
		}
		
		console.log(productIdList);
		
		/*<![CDATA[*/
	    var path = /*[[@{/}]]*/'removeList';
	    /*]]>*/
	    
	    bootbox.confirm({
			message: "Bạn có chắc chắn muốn xóa sản phẩm ? Hành động này không thể hoàn tác.",
			buttons: {
				cancel: {
					label:'<i class="fa fa-times"></i> Hủy'
				},
				confirm: {
					label:'<i class="fa fa-check"></i> Xác nhận'
				}
			},
			callback: function(confirmed) {
				if(confirmed) {
					$.ajax({
						type: 'POST',
						url: path,
						data: JSON.stringify(productIdList),
						contentType: "application/json",
						success: function(res) {
							console.log(res); 
							location.reload()
							},
						error: function(res){
							console.log(res); 
							location.reload();
							}
					});
				}
			}
		});
	});
	
	$("#selectAllProducts").click(function() {
		if($(this).prop("checked")==true) {
			$(".checkboxProduct").prop("checked",true);
		} else if ($(this).prop("checked")==false) {
			$(".checkboxProduct").prop("checked",false);
		}
	})
});