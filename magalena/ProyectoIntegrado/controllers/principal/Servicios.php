<?php
    class  Servicios extends Controller{
        public function __construct(){
            parent::__construct();
        }
        public function index(){
            $data['title'] = 'Como Llegar';
            $this->views->getView('principal/servicios/index',$data);
        }
    }
?>