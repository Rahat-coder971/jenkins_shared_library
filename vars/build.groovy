def call(String img_name){
    bat "docker build -t ${img_name} ."
}
