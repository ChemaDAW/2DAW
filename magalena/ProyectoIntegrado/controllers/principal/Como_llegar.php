<?php
    class  Como_llegar extends Controller{
        public function __construct(){
            parent::__construct();
        }
        public function index(){
            $data['title'] = 'Como Llegar';
            $this->views->getView('principal/como_llegar/index',$data);
        }
    }
?>