package cn.edu.xmu.other.controller;

import cn.edu.xmu.ooad.annotation.Audit;
import cn.edu.xmu.ooad.model.VoObject;
import cn.edu.xmu.ooad.util.Common;
import cn.edu.xmu.ooad.util.ResponseCode;
import cn.edu.xmu.ooad.util.ReturnObject;
import cn.edu.xmu.other.model.vo.User.UserSignUpVo;
import cn.edu.xmu.other.service.UserService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController /*Restful的Controller对象*/
@RequestMapping(value = "/other", produces = "application/json;charset=UTF-8")
public class OtherController {
    private static final Logger logger = LoggerFactory.getLogger(OtherController.class);

    @Autowired
    private HttpServletResponse httpServletResponse;

    @Autowired
    private UserService userService;

    /***
     * 获得买家的所有状态
     * @param UserId 用户id
     * @return Object
     */
    @Audit
    @GetMapping("/users/states")
    public Object getAllUserState (@PathVariable Long UserId){
        return null;
    }

    /***
     * 注册用户
     * @param vo 用户视图
     * @param bindingResult 校验错误
     * @return Object 用户返回视图
     */
    @ApiOperation(value = "注册用户", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "UserSignUpVo", name = "vo", value = "可填写的用户信息", required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 0,   message = "成功"),
            @ApiResponse(code = 731, message = "用户名已被注册"),
            @ApiResponse(code = 732, message = "邮箱已被注册"),
            @ApiResponse(code = 733, message = "电话已被注册")
    })
    @PostMapping("/users")
    public Object signUpUser(@Validated @RequestBody UserSignUpVo vo, BindingResult bindingResult) {
        Object object = Common.processFieldErrors(bindingResult, httpServletResponse);
        if(null != object) {
            logger.debug("Validate failed");
            logger.debug("UserSignUpVo:" + vo);

            return object;
        }

        ReturnObject<VoObject> returnObject = userService.signUp(vo);
        if(returnObject.getCode().equals(ResponseCode.OK)) {
            Object returnVo = returnObject.getData().createVo();
            httpServletResponse.setStatus(HttpStatus.CREATED.value());
            return Common.decorateReturnObject(new ReturnObject(returnVo));
        } else {
            return Common.getRetObject(returnObject);
        }

    }

    /***
     * 买家查看自己信息
     * @param UserId 用户id
     * @return Object
     */
    @GetMapping("/users")
    public Object getUserSelfInfo(@PathVariable Long UserId) {
        return null;
    }

    /***
     * 买家修改自己的信息
     * @param UserId 用户id
     * @return Object
     */
    @PutMapping("/users")
    public Object modifyUserSelfInfo(@PathVariable Long UserId) {
        return null;
    }

    /***
     * 用户修改密码
     * @return Object
     */
    @PutMapping("/users/password")
    public Object modifyUserSelfPassword() {
        return null;
    }

    /***
     * 用户重置密码
     * @return Object
     */
    @PutMapping("/users/password/reset")
    public Object resetUserSelfPassword() {
        return null;
    }

    /***
     * 平台管理员获取所有用户列表
     * @return Object
     */
    @GetMapping("/users/all")
    public Object getAllUser() {
        return null;
    }

    /***
     * 用户名密码登录
     * @return Object
     */
    @PostMapping("/users/login")
    public Object loginUser() {
        return null;
    }

    /***
     * 用户登出
     * @return Object
     */
    @GetMapping("/users/logout")
    public Object logoutUser() {
        return null;
    }

    /***
     * 管理员查看任意买家信息
     * @return Object
     */
    @GetMapping("/users/{id}")
    public Object getUserInfo() {
        return null;
    }

    /***
     * 平台管理员封禁买家
     * @return Object
     */
    @PutMapping("/users/{id}/ban")
    public Object banUser() {
        return null;
    }

    /***
     * 平台管理员解禁买家
     * @return Object
     */
    @PutMapping("/users/{id}/release")
    public Object releaseUser() {
        return null;
    }
}