const base = {
    get() {
                return {
            url : "http://localhost:8080/springboot7z60r/",
            name: "springboot7z60r",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot7z60r/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "线上鲜花商城管理系统"
        } 
    }
}
export default base
