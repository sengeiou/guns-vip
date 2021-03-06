/**
 * 添加或者修改页面
 */
var QxGiftInfoDlg = {
    data: {
        version: "",
        createdBy: "",
        createdTime: "",
        updatedBy: "",
        updatedTime: "",
        deleted: "",
        name: "",
        image: "",
        price: ""
    }
};

layui.use(['form', 'admin', 'ax', 'upload'], function () {
    var $ = layui.jquery;
    var $ax = layui.ax;
    var form = layui.form;
    var admin = layui.admin;
    var upload = layui.upload;

    //让当前iframe弹层高度适应
    // admin.iframeAuto();

    // 普通图片上传
    upload.render({
    	elem: '#imageBtn',
    	url: Feng.ctxPath + "/api/file/uploadPackage",
    	before: function(obj) {
    		obj.preview(function(index, file, result){
    			$('#img1').attr('src', result);
    		});
    	},
    	done: function(res) {
    		$('#image').val(res.data);
    		Feng.success('图片上传成功');
    	},
    	error: function() {
    		Feng.error('图片上传失败');
    	}
    });
    
    //表单提交事件
    form.on('submit(btnSubmit)', function (data) {
        var ajax = new $ax(Feng.ctxPath + "/qxGift/addItem", function (data) {
            Feng.success("添加成功！");

            //传给上个页面，刷新table用
            admin.putTempData('formOk', true);

            //关掉对话框
            admin.closeThisDialog();

        }, function (data) {
            Feng.error("添加失败！" + data.responseJSON.message)
        });
        ajax.set(data.field);
        ajax.start();

        return false;
    });

});