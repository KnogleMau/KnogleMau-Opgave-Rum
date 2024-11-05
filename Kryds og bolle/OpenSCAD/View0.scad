translate([25.0, 25.0, 1.0])
{
    union()
    {
        linear_extrude(height = 1.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
        {
            scale([8.0, 1.0])
            {
                M8();
            }
        }
        rotate([0.0, 0.0, 90.0])
        {
            rotate([0.0, 0.0, 0.0])
            {
                rotate([0.0, 0.0, 0.0])
                {
                    linear_extrude(height = 1.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
                    {
                        scale([8.0, 1.0])
                        {
                            M8();
                        }
                    }
                }
            }
        }
    }
}

module M8()
{
    polygon
    (
        points =
        [
            [-0.5, -0.5], 
            [0.5, -0.5], 
            [0.5, 0.5], 
            [-0.5, 0.5]
        ],
        paths =
        [
            [0, 1, 2, 3]
        ]
    );
}
