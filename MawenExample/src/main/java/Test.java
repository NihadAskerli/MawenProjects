public  class Test {
    public static void main(String[] args)throws Exception {

        Teacher t= new Teacher();


        //Student[] ss={new Student()};
        //t.setStudents(ss);
        //
        //checkObjNotNull(t);

        //        Config c=new Config();
        //        Method[]methods=c.getClass().getDeclaredMethods();
        //        for(int i=0;i<methods.length;i++){
        //            Method m=methods[i];
        //            Annotation[]anns=m.getAnnotations();
        //            System.out.println(methods[i].getName());
        //
        //
        //
        //
        //            for(int j=0;j<anns.length;j++){
        //                Annotation ann=anns[j];
        //                System.out.println(anns[j].annotationType());
        //            }
        //            System.out.println("-------------");
        //        }
        //        annotationslari gormek

    }

//    public static void checkObjNotNull(Object obj) throws Exception {
//
//
//
//        Method[] methods = obj.getClass().getDeclaredMethods();
//        for (int i = 0; i < methods.length; i++) {
//            Method m = methods[i];
//            Annotation[] anns = m.getAnnotations();
//            System.out.println(methods[i].getName());
//
//
//            for (int j = 0; j < anns.length; j++) {
//                Annotation ann = anns[j];
////                if(ann.annotationType()== BoshOlmasin.class) {
//                    Object result = m.invoke(obj);
//                    if (result == null) {
//                        throw new IllegalArgumentException("dedim axi bosh olmasin");
//                    }
//
//                    if (result instanceof Object) {
//                        Object[] arr = (Object[]) result;
//                        if (arr.length == 0) {
//                            throw new IllegalArgumentException("dedim axi bos olmasin arr");
//                        }
//                    }
//                }
//                System.out.println(ann.annotationType());
//            }
//
//        }
//        System.out.println("-------------");
//    }
//}
}